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
<body><center>
    <h1>LOGIN PAGE</h1>
    <form method="post">
        <input type="email" name ="uemail" placeholder ="Enter your email"><br>
        <input type="password" name ="upass" placeholder ="Enter your email"><br>
        <input type="submit" name ="login" value ="login">
        <input type="reset" value ="reset">
    </form>
</center>
    <?php echo @$msg; ?>
</body>
</html>