<?php
echo '<pre>';
print_r($_POST);
echo '</pre>';
####################################################################################
if(@$_POST['login']=='login')
{
    extract($_POST);
    if($uemail=="" && $upass==""){
        $msg="please fill all details";
    }
    else if($uemail==""){
        $msg="please fill your email";
    }
    else if($upass==""){
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
<body>
    <form method="post">
        <input type="email" name ="uemail" placeholder ="Enter your email"><br>
        <input type="password" name ="upass" placeholder ="Enter your email"><br>
        <input type="submit" name ="login" value ="login">
    </form>
    <?php echo @$msg; ?>
</body>
</html>