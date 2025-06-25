BEGIN
  FOR loan IN (
    SELECT l.LoanID, l.CustomerID, l.DueDate, c.Name
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
    WHERE l.DueDate <= SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || 'for the Customer ' || loan.Name ||
                         ' is due within ' || TO_CHAR(loan.DueDate, 
                         'YYYY-MM-DD'));
  END LOOP;
END;
/