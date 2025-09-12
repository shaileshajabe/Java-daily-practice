-- Question:
-- Find all students who scored more than 75 marks.

CREATE TABLE Students (
    StudentID INT PRIMARY KEY,
    StudentName VARCHAR(50),
    Marks INT
);

INSERT INTO Students (StudentID, StudentName, Marks) VALUES
(1, 'Ramesh', 80),
(2, 'Suresh', 65),
(3, 'Mahesh', 90),
(4, 'Ganesh', 70),
(5, 'Dinesh', 85);

-- Solution:
SELECT * 
FROM Students
WHERE Marks > 75;
