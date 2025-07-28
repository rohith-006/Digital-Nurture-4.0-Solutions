CREATE OR REPLACE PROCEDURE TransferFunds (
    p_source_account IN NUMBER,
    p_target_account IN NUMBER,
    p_amount IN NUMBER
) AS
    v_source_balance NUMBER;
BEGIN
    -- Get source balance
    SELECT BALANCE INTO v_source_balance FROM ACCOUNTS WHERE ACCOUNT_ID = p_source_account FOR UPDATE;

    -- Check if sufficient
    IF v_source_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;

    -- Deduct from source
    UPDATE ACCOUNTS
    SET BALANCE = BALANCE - p_amount
    WHERE ACCOUNT_ID = p_source_account;

    -- Add to target
    UPDATE ACCOUNTS
    SET BALANCE = BALANCE + p_amount
    WHERE ACCOUNT_ID = p_target_account;

    DBMS_OUTPUT.PUT_LINE('Transferred ' || p_amount || ' from account ' || p_source_account || ' to account ' || p_target_account);

    COMMIT;
END;
/
EXEC TransferFunds(101, 202, 500);
