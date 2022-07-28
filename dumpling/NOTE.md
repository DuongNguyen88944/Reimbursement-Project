PRESENTATION IMPORTANT INFOS
Who Presenting What? (The topics will be presented in the following order)
1.Repository/Service TEST     Viet
2.API Routes Test             Fabian
3.HTML/E2E                    Duong

REPOSITORY/SERVICE PRESENTER NOTE


API ROUTES PRESENTER NOTE
1.PLEASE CHANGE THE CREDENTIAL FOR THE LOGIN TEST TO
    username: Manager
    password: password

HTML/E2E PRESENTER NOTE
1.PLEASE USE THE FOLLOWING CREDENTIAL TO LOG IN AS MANAGER
    username: Manager
    password: password
2.PLEASE USE THE FOLLOWING CREDENTIAL TO LOG IN AS EMPLOYEE
    username: Fabian
    password: password
3.PLEASE ENTER A REQUEST THAT IS EASY TO RECOGNIZE 
4.AFTER GO BACK TO THE MANAGER PAGE TO APPROVE A REQUEST PLEASE PICK THE ONE THAT JUST ASSIGN USING THE EMPLOYEE PAGE (THE LAST ID ON THE LIST)


----------------------------------------------------------------------

IMPORTANT: The following steps need to be done to reset database BEFORE run any test
IF THE REQUESTS TABLE IN DBEAVER IS NOT EMPTY AND CONTAIN ID 1,2 AND 3 RUN THE FOLLOWING SQL COMMANDS IN DBEAVER
    update requests set status = 'Pending' where ticket_number = 2;
    update requests set status = 'Pending' where ticket_number = 3;

ELSE IF THE REQUESTS TABLE IS EMPTY RUN THE FOLLOWING COMMANDS
    insert into requests values (1, 'Fabian', 'To be updated', 500, 'Pending', 'N/A');
    insert into requests values (2, 'Automation Test Accept', 'Gas money', 500, 'Pending', 'N/A');
    insert into requests values (3, 'Automation Test Reject', 'Gas money', 500, 'Pending', 'N/A');
    

------------------------------------------------------------------------

PLEASE CHANGE THE FOLLOWING AFTER YOU PULL THE FINAL VERSION OF THE APP TO YOUR VSC (YOU CAN CHANGE IT ON MAIN BRANCH AND DO NOT PUSH ANYTHING)
1, URL FOR EACH WEBPAGE
2, URL FOR BACKGROUND IMAGES, located and label in the pictures folder under webpages. It is label so employee and manager page will use the "Background.png" and login page will use the "loginBackground.png"

-------------------------------------------------------------------------

PLEASE FEEL FREE TO CHANGE THE CSS DESIGN IF YOU LIKE!
THANK YOU!