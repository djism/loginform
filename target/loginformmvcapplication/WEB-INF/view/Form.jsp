<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

    <body>
        <h1>Please Submit The Form.</h1>

        <form:errors path="user1.*"/>

        <form action="/submit" method="post">
        <table>
            <tr>
                <td>UserName:</td> <td><input type="text" name="userName"/></td>
            </tr>
            <tr>
                <td>Password:</td> <td><input type="password" name="userPassword"/></td>
            </tr>
            <tr>
                <td>Phone:</td> <td><input type="text" name="userPhone"/></td>
            </tr>
            <tr>
                <td>DOB:</td> <td><input type="text" name="userDOB"/></td>
            </tr>
            <tr>


                <td>Skills:</td>  <td><select name="userSkills" multiple>
                <option value="Java Core"> Java Core</option>
                <option value="Spring Core"> Spring Core</option>
                <option value="Spring MVC"> Spring MVC</option>
                </select></td>
            </tr>
            <tr><td><input type="submit" value="SUBMIT"/></td>
            </tr>
        </form>
    </body>

</html>