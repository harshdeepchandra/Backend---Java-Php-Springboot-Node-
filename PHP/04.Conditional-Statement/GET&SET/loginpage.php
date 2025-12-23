<?php error_reporting(0)?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
</head>

<body>
    <form method="post">
        <h1 align="center">LOGIN PAGE</h1>
        <input type="email" name="email" value="<?php echo $email;?>" placeholder="Enter Your Email"><br> <br>
        <input type="password" name="password" value="<?php echo $password;?>" placeholder="Enter Your Password">
        <input type="submit" name="login" value="login">
    </form>
    <?php echo $res;?>





</body>

</html>
<!-- --------------------------------------------------------------------------- -->
<?php
// echo '<pre>';
// print_r($_GET);
// echo '</pre>';

extract($_POST);
if (is_null($login)){
    
}
elseif(empty($email)){
    echo 'enter your email';
}
elseif(empty($password)){
    echo 'enter your password';
}
elseif(isset($login)){
   
    echo 'weclome';
}
else{
   $res="No Resulst Found";
}
?>