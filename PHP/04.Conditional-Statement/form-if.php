<?php
if(isset($_POST)){
$num=$_POST['num'];
// =assingment ,== compair 
if($num==1){
    echo "<h1> one</h1>";
}
else if($num==2){
    echo "<h1> two</h1>";
}
else if($num==3){
    echo "<h1> three</h1>";
}
else if($num==4){
    echo "<h1> four</h1>";
}
else if($num==5){
    echo "<h1> five</h1>";
}
else{
    echo "<h2> on opp found</h2>";
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
<form method ="post">
    <input type="number" name="num" placeholder="Enter 1 to 5 Numbers">
    <input type="submit" name="res" value="Result">
</form>
</body>
</html>