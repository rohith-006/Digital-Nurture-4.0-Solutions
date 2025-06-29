SET SERVEROUTPUT ON;

BEGIN
    FOR loan_rec IN (
        SELECT L.LOAN_ID, L.CUSTOMER_ID, L.DUE_DATE, C.NAME
        FROM LOANS L
        JOIN CUSTOMERS C ON L.CUSTOMER_ID = C.CUSTOMER_ID
        WHERE L.DUE_DATE BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ID ' || loan_rec.LOAN_ID ||
            ' for Customer ' || loan_rec.NAME ||
            ' (ID: ' || loan_rec.CUSTOMER_ID ||
            ') is due on ' || TO_CHAR(loan_rec.DUE_DATE, 'DD-MON-YYYY') || '.'
        );
    END LOOP;
END;
/
