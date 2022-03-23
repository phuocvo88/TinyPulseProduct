Instruction to run from commandline
********************************************************************
Prerequisite: your machine should be installed java ahead. If not, please download and install jdk 11 on your machine: https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html
from cmd, check if java is stalled yet by using command: java -version
********************************************************************

Step 1: From command line, Navigate to directory of your project


-----------------------------------------------------------------
Step 2: In command line, set project path
set ProjectPath=[Project Folder]
echo %ProjectPath%

Example: 
<E:\AssignmentsForInterview\Limeaid>set ProjectPath=E:\AssignmentsForInterview\Limeaid
<E:\AssignmentsForInterview\Limeaid>echo %ProjectPath%

=> It shows value projectpath that we just set: "E:\AssignmentsForInterview\Limeaid"


------------------------------------------------------------------
Step 3: Set class path
set classpath=%ProjectPath%\bin;%ProjectPath%\libraries\*
echo %classpath%


Example:
<E:\AssignmentsForInterview\Limeaid>set classpath=%ProjectPath%\bin;%ProjectPath%\libraries\*
<E:\AssignmentsForInterview\Limeaid>echo %classpath%

=> It shows value of classpath that we just set: "E:\AssignmentsForInterview\Limeaid\bin;E:\AssignmentsForInterview\Limeaid\libraries\*"


------------------------------------------------------------------
Step 4: Now execute the java command for TestNG as shown below
java org.testng.TestNG %ProjectPath%\resources\runTinyPulseTest.xml

Example:
<E:\AssignmentsForInterview\Limeaid>java org.testng.TestNG %ProjectPath%\resources\runTinyPulseTest.xml


------------------------------------------------------------------
Step 5: The test suite is now running. Wait for it finishes and check the test result.

Example:
===============================================
TINYPULSE
Total tests run: 2, Failures: 0, Skips: 0
===============================================



********************************************************************
For your refrence on how to run TESTNG suite from xml file, refer to: http://qtp-automate.blogspot.com/2011/10/running-selenium-testng-test-from.html