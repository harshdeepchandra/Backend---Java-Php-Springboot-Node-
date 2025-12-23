<?php
#---------------------------String-----------------------------
 $msg1="welcome ";
 $msg2='PHP';
 echo $msg1;
 echo $msg2;

 echo "<h1>$msg1</h1>";

 echo '<h1>$msg2</h1>';

 echo "<h1>$msg1 $msg2</h1>";

 echo '<h1>' . $msg1 . $msg2 .'</h1>';

 echo "<h1>hello {$msg1} {$msg2} CHAD </h1>";

 echo $msg1 .$msg2;
 echo '<h1>'.$msg1.$msg2.'</h1>';
 echo "<h1> $msg1</h1>";
  echo '<hr>';
 ?>
 <?php
#                               string function 
echo '<h1>string function</h1>';
$msg="hello i am new user";
// echo $msg;
// echo '<hr>'.strtoupper($msg);
// echo '<hr>'.strtolower($msg);
// echo '<hr>'.ucfirst ($msg);
// echo '<hr>'.ucwords ($msg);
#                                   repeat karane ke liye 
echo str_repeat ($msg,50);

# length calculated function
echo '<hr>'.strlen($msg);

 ?>