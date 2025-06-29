SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    UPDATE ACCOUNTS
    SET BALANCE = BALANCE * 1.01
    WHERE ACCOUNT_TYPE = 'SAVINGS';

    DBMS_OUTPUT.PUT_LINE('Monthly interest applied to all savings accounts.');

    COMMIT;
END;

/
EXEC ProcessMonthlyInterest;

