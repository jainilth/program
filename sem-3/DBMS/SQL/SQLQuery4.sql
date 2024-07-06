--PART-1
--1. Add two more columns City VARCHAR (20) and Pincode INT.
ALTER TABLE DEPOSIT
ADD CITY VARCHAR(20),
	PINCODE INT

--2. Change the size of CNAME column from VARCHAR (50) to VARCHAR (35).
ALTER TABLE DEPOSIT
ALTER COLUMN CNAME VARCHAR(35)

--3. Change the data type DECIMAL to INT in amount Column.
ALTER TABLE DEPOSIT
ALTER COLUMN AMOUNT DECIMAL(8,2)

--4. Rename Column ActNo to ANO.
EXEC SP_RENAME 'DEPOSIT.ACTNO','ANO'

--5. Delete Column City from the DEPOSIT table.
ALTER TABLE DEPOSIT
DROP COLUMN CITY

--6. Change name of table DEPOSIT to DEPOSIT_DETAIL
EXEC SP_RENAME 'DEPOSIT','DEPOSIT_DETAIL'

--PART-B
--1. Rename Column ADATE to AOPENDATE OF DEPOSIT_DETAIL table.
EXEC SP_RENAME 'DEPOSIT_DETAIL.ADATE','AOPENDATE'

--2. Delete Column AOPENDATE from the DEPOSIT_DETAIL table.
ALTER TABLE DEPOSIT_DETAIL 
DROP COLUMN AOPENDATE

--3. Rename Column CNAME to CustomerName.
ALTER TABLE STUDENT_DETAIL
ADD CITY VARCHAR(20) NOT NULL,
BACKLOG INT

--2. Change the size of NAME column of student_detail from VARCHAR (25) to VARCHAR (35).
ALTER TABLE STUDENT_DETAIL
ALTER COLUMN NAME VARCHAR(35)

--3. Change the data type DECIMAL to INT in CPI Column.
ALTER TABLE STUDENT_DETAIL
ALTER COLUMN CPI INT

--4. Rename Column Enrollment_No to ENO.
EXEC SP_RENAME 'STUDENT_DETAIL.ENROLLMENT_NO','ENO'

--5. Delete Column City from the student_detail table.
ALTER TABLE STUDENT_DETAIL
DROP COLUMN CITY

--6. Change name of table student_detail to STUDENT_MASTER.
EXEC SP_RENAME 'DEPOSIT_DETAIL','STUDENT_MASTER'

--DELETE, Truncate, Drop Operation
--Part � A:

--1. Delete all the records of DEPOSIT_DETAIL table having amount greater than and equals to 4000.
DELETE FROM DEPOSIT_DETAIL
WHERE AMOUNT>=4000

--2. Delete all the accounts CHANDI BRANCH.


--3. Delete all the accounts having account number (ANO) is greater than 105.


--4. Delete all the records of Deposit_Detail table. (Use Truncate)


--5. Remove Deposit_Detail table. (Use Drop)