SET SERVEROUTPUT ON;
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department IN VARCHAR2,
    p_bonus_pct IN NUMBER
) AS
BEGIN
    UPDATE EMPLOYEES
    SET SALARY = SALARY + (SALARY * p_bonus_pct / 100)
    WHERE DEPARTMENT = p_department;

    DBMS_OUTPUT.PUT_LINE('Bonus of ' || p_bonus_pct || '% applied to department: ' || p_department);

    COMMIT;
END;
/

EXEC UpdateEmployeeBonus('SALES', 10);

