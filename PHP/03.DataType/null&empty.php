<?php
#-----null/empty
#null:-not contain any garbage collection value.
#empty:-contain any garbage collection value.
$var1=null;
$var2="";
echo $var1.'null:-<hr>empty:-'.$var2;
?>
  <!-- null(is_null) -->
<h2>var1 null :- <?php echo is_null($var1); ?></h2>

<h2>var2 null :- <?php echo is_null($var2); ?></h2>

<h2>var3 null :- <?php echo is_null($var3); ?></h2>

<!-- set(isset) -->
<h2>var1 set  :-<?php echo isset($var1); ?></h2>

<h2>var2 set  :-<?php echo isset($var2); ?></h2>

<h2>var3 set  :-<?php echo isset($var3); ?></h2>

<!--  empty : "", '', null, 0, 0.0, false, array() -->

<h2>var1 empty  :-<?php echo empty($var1); ?></h2>

<h2>var2 empty  :-<?php echo empty($var2); ?></h2>

<h2>var3 empty  :-<?php echo empty($var3); ?></h2>