<?php
// echo '<pre>';
// print_r($_GET);
// echo '</pre>';
error_reporting(0);

extract($_POST);

if(isset($add)){
   
    $res= $num1+$num2;
}
else if($sub){
   
    $res= $num1-$num2;
}
else if($mul){
   
    $res= $num1*$num2;
}
else if($div){
   
    $res= $num1/$num2;
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
    <title>Calculater</title>
</head>

<body>
    <form method="post">
        <input type="text" name="num1" value="<?php echo $num1;?>" placeholder="Enter First Number">
        <input type="text" name="num2" value="<?php echo $num2;?>" placeholder="Enter Second Number">
        <input type="submit" name="add" value="add">
        <input type="submit" name="sub" value="sub">
        <input type="submit" name="mul" value="mul">
        <input type="submit" name="div" value="div">
    </form>
    <?php echo $res;?>





</body>

</html>