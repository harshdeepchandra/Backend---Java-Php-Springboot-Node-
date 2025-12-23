<?php
// echo '<pre>';
// print_r($_GET);
// echo '</pre>';
error_reporting(0);

extract($_POST);

if(isset($login)){
   
    echo $email .'<br>';
    echo $password .'<br>';
}
else{
   $res="No Resulst Found";
}










?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
</head>

<body>
    <form method="post">
        <input type="email" name="email" value="<?php echo $email;?>" placeholder="Enter Your Email"><br> <br>
        <input type="password" name="password" value="<?php echo $password;?>" placeholder="Enter Your Password">
        <input type="submit" name="login" value="login">
    </form>
    <?php echo $res;?>





</body>

</html>