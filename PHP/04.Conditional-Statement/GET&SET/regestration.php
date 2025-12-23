<?php
echo '<pre>';
print_r($_POST);
echo '</pre>';
####################################################################################
if(isset($_POST['login']))
{
    extract($_POST);
    if(empty($uemail) && empty($upass)){
        $msg="please fill all details";
    }
    else if(empty($uemail)){
        $msg="please fill your email";
    }
    else if(empty($upass)){
        $msg="please fill your password";
    }
    else if(empty($utype)){
        $msg="Please Fill your Gender";
    }
    else if(empty($tech1)){
        $msg="Please Fill Your Course";
    }
    else {
        $msg="Welcome";
    }
}


?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<center>
    <h1>LOGIN PAGE</h1>
    <form method="post">
        <input type="email" name ="uemail" placeholder ="Enter your email"><br>
        <input type="password" name ="upass" placeholder ="Enter your email"><br>
    <P>
        <input type="radio" name="utype" value="male">MALE
        <input type="radio" name="utype" value="female">FEMALE
    </P>
        
<p>
        <input type="checkbox" name="tech1">HTML
        <input type="checkbox" name="tech1">CSS
        <input type="checkbox" name="tech1">JAVASCRIPT
        <input type="checkbox" name="tech1">REACT
</p>
<input type="submit" name ="login" value ="login">
        <input type="reset" value ="reset">
    </form>
</center>
    <?php echo @$msg; ?>
</body>
</html>