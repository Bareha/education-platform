# Overview
This java program is an education platform to facilitate learning for students.

# Key Features
- <b>Video Lectures</b>- three video lectures belong to a single course
- <b>Assignments</b>- one self-assessed assignment containing 5 text-based questions is added in the course packages
- <b>Quizzes</b>- one MCQ based quiz along with a score calculator is added in the course packages
- <b>Interface</b>- this project has been integrated with GUI using SceneBuilder

# Controllers and FXML
- A controller is a class which contains the definitions for the method which are called upon engaging with the buttons
- Our project has been made using 16 such controllers including the main class
- A controller has to be linked with the FXML file of the page, so that it knows which controller to depend upon
- And these FXML files have been made using SceneBuilder
- We used SceneBuilder to create our interfaces so that we could focus on writing the java codes that would be used as controllers

# Start Page
<b>Main class:</b> This is where the compilation starts from. Our main class sets the scene “StartPageGUI.fxml” and hence it instigates the controller chain.<br>
The user will only be allowed to enter if the captcha is successfully done. If the check box is not checked then the user can’t proceed further, but if it is checked then code switches to the scene “LoginGUI.fxml”.

# Login Page
This controller checks if the user has entered correct credentials that are in the “AccountDatabase.txt” file. The username and password are stored in the file in the format:<br>
username+“ ”+password<br>
A set of username and password is stored in every line and the FileReader checks for the correct combination of the credentials line by line. If it finds the pair, then the user has made an account already, but if it doesn’t, then the user has to make an account first.

# Home Page
This controller has the method definitions for the Home Page of the application. This page contains buttons to select a course of choice. Moreover a menu bar has been made which has functioning menu items that take you to pages they specify.

# Course Page
This controller is the one which contains the course preview. This contains buttons for quiz, assignment, lectures and to purchase course.<br>
The buttons are set disabled by default and have to be enabled by purchasing the course.

# Purchase Page
Once we select a course to purchase, we click on the “Kickstart Learning” button, which takes us to the purchase page.<br>
This page only checks if the format of the credentials entered by the user is correct. It validates the purchase if the credentials are correct.<br>
Once the purchase is validated, a string will be saved in a file and hence, the purchase will not be required to be made again, as the file has to be read first in order to check for any purchase redundancies.<br>
Once the payment is successful, it will take back to the course page where you click on the buttonagain, but this time the disabled buttons will be enabled and you can access the course’s different features like video lectures, quizzes and assignments.
<br>
<hr>
<b>NOTE:</b> Three videos of lectures belong to all courses. (These have not been included in the repository)<br>
Branding- BRLecture1.mp4, BRLecture2.mp4, BRLecture3.mp4<br>
Digital Marketing- DMLecture1.mp4, DMLecture2.mp4, DMLecture3.mp4<br>
Human Resource- HRLecture1.mp4, HRLecture2.mp4, HRLecture3.mp4<br>
Sales- SalesLecture1.mp4, SalesLecture2.mp4, SalesLecture3.mp4<br>
Web Development- WDLecture1.mp4, WDLecture2.mp4, WDLecture3.mp4
