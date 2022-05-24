---
# try also 'default' to start simple
theme: codeg
# random image from a curated Unsplash collection by Anthony
# like them? see https://unsplash.com/collections/94734566/slidev
background: https://source.unsplash.com/collection/94734566/1920x1080
# apply any windi css classes to the current slide
class: 'text-center'
# https://sli.dev/custom/highlighters.html
highlighter: prism
# show line numbers in code blocks
lineNumbers: true
# some information about the slides, markdown enabled
info: |
  ## Source-level dataflow-based fixes: experiences from using IntraJ and MagpieBridge
  Idriss Riouak


# persist drawings in exports and build
drawings:
  persist: false
---

# Source-level 

# Dataflow-based fixes

## Experiences from using IntraJ and MagpieBridge

Idriss Riouak - Lund University






<div class="abs-br m-6 flex gap-2">
 <a href="https://github.com/slidevjs/slidev" target="_blank" alt="GitHub"
    class="text-xl icon-btn opacity-50 !border-none !hover:text-white">
     <img border="rounded" width="25"  src="imgs/logo.png">
  </a>
  <a href="https://github.com/slidevjs/slidev" target="_blank" alt="GitHub"
    class="text-xl icon-btn opacity-50 !border-none !hover:text-white">
    <carbon-logo-github />
  </a>
</div>

<!--
The last comment block of each slide will be treated as slide notes. It will be visible and editable in Presenter Mode along with the slide. [Read more in the docs](https://sli.dev/guide/syntax.html#notes)
-->

---

# Example Dataflow-based analyses

<div  grid="~ cols-2 gap-2" m="-t-2">
```java {all|2|4|all}
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```

<div>

### Null pointer Analysis (NPA)


<br>
<br>
<p v-click="2">
⚠️ Possible <code style="color:red">NullPointerException</code> at line 4
</p>

<arrow v-click="2"  x1="600" y1="200" x2="260" y2="200" color="red" width="1.5" arrowSize="1" />

</div>
</div>

<div  v-click="4" grid="~ cols-2 gap-2" m="-t-2">
```java {1|2-8|3-6|8|all}
private int hash = 0;
int hashFunc(){
  if(hash==0){
    int hash = 10;
    //Complex operations on  hash
    hash += 10;
  }
  return hash;
}
```

<div>

### Dead Assignment Analysis (DAA)

###### Simplified example from Apache FOP (90 KLOC)


<br><br>

<p v-click="7">
⚠️ <code style="color:red">Dead Assignment</code> at line 6. The value of <code style="color:red">hash</code> is never read.
</p>
<arrow v-click="7"  x1="600" y1="400" x2="260" y2="400" color="red" width="1.5" arrowSize="1" />
</div>

</div>
<!--
You can have `style` tag in markdown to override the style for the current page.
Learn more: https://sli.dev/guide/syntax#embedded-styles
-->

---

# The big picture

<img  border="rounded" style="top:70px;position:relative;width:120%"  src="imgs/overview.svg">


---

# Reference Attribute Grammars 



<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/AST1.svg">



---

# Reference Attribute Grammars 



<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/AST2.svg">

---

# Reference Attribute Grammars 



<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/AST3.svg">

---




# Reference Attribute Grammars 

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/AST5.svg">

---


# Reference Attribute Grammars 

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/AST6.svg">

---







# Reference Attribute Grammars 

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/AST8.svg">



---


# Reference Attribute Grammars 

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/AST9.svg">




---

# Reference Attribute Grammars 

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/AST10.svg">

---

# Reference Attribute Grammars 

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/AST7.svg">


---
# Reference Attribute Grammars 

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/AST11.svg">

---

# Reference Attribute Grammars 

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/AST12.svg">

---



# Reference Attribute Grammars 

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/AST13.svg">

---




# Reference Attribute Grammars 

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/AST14.svg">

---

# Reference Attribute Grammars 

<div  grid="~ cols-2 gap-2" m="-t-2">

<div>

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```

* JastAdd ecosystem
   * Ondemand evaluation
   * Mutually dependent properties
   * Add subtree to the AST
<img  border="rounded" style="top:0px;left:0px;position:relative;width:30%;border: 2px solid #66d390;"  src="imgs/jastadd.png">

</div>
</div>
<img  border="rounded" style="top:-307.5px;left:150px;position:relative;width:100%"  src="imgs/AST14.svg">

---







#   IntraJ


<div>

* Builds the CFGs on the AST
* Handles implicit control-flows
* Analyses competitive with existing tools e.g., **_SonarQube_**

<br>
<h2 style="position:fixed; left:30%">If you want to know more ...</h2>


<div  grid="~ cols-2 gap-2" m="-t-2">

<div>


<br><br><br>

<img  border="rounded" style="top:0px;left:100px;position:relative;width:40%;border: 2px solid #66d390;"  src="imgs/qr-code.svg">
<h2 style="position:relative; left:130px">GitHub</h2>
</div>

<div>


<br><br><br>

<img  border="rounded" style="top:0px;left:100px;position:relative;width:40%;border: 2px solid #66d390;"  src="imgs/paper.svg">
<h2 style="position:relative; left:140px">Paper</h2>
</div>


</div>

</div>
---


# Null Pointer Analysis

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/NPA3.svg">

---


# Null Pointer Analysis

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/NPA1.svg">





---

# Null Pointer Analysis

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/NPA4.svg">


---

# Null Pointer Analysis

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/NPA5.svg">


---

# Null Pointer Analysis

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/NPA6.svg">

---


# Null Pointer Analysis

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/NPA7.svg">


---

# Null Pointer Analysis

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/NPA8.svg">


---

# Null Pointer Analysis

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/NPA9.svg">

---


# Null Pointer Analysis

<div  grid="~ cols-2 gap-2" m="-t-2">

```java
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```
</div>
<img  border="rounded" style="top:-150px;left:150px;position:relative;width:100%"  src="imgs/NPA10.svg">








---

# The big picture

<img  border="rounded" style="top:70px;position:relative;width:120%"  src="imgs/overview.svg">

---

# IntraJ Plugin


* Credits:
  * Plugin V 0.1 made by Charlie Mrad (Master Student @ LU)

* Live demo:
  * Null Pointer Analysis
  * Dead Assignment Analysis
* The role of MagpieBridge:
  * Integration with VSCode
  * Extension settings



---

# Tip of the Iceberg


<img  border="rounded" style="top:0px;left:100px;position:relative;width:80%;border: 2px solid #66d390;"  src="imgs/iceberg.jpg">



---

# Thank you for your attention !

<div  grid="~ cols-3 gap-2" m="-t-2">

<div>


<br><br><br>

<img  border="rounded" style="top:0px;left:100px;position:relative;width:60%;border: 2px solid #66d390;"  src="imgs/qr-code.svg">
<h2 style="position:relative; left:130px">GitHub</h2>
</div>

<div>


<br><br><br>

<img  border="rounded" style="top:0px;left:100px;position:relative;width:60%;border: 2px solid #66d390;"  src="imgs/paper.svg">
<h2 style="position:relative; left:140px">Paper</h2>
</div>

<div>


<br><br><br>

<img  border="rounded" style="top:0px;left:100px;position:relative;width:60%;border: 2px solid #66d390;"  src="imgs/vscoderepo.svg">
<h2 style="position:relative; left:115px">Extension</h2>
</div>


</div>

---

# Motivations: source-level
<div  grid="~ cols-2 gap-2" m="-t-2">
<div>
```java {all}
void foo(boolean b){
  String x = null;
  if(b) x = "Hello World";
  x.toString();
}
```


### Advantages
  1) Error are directly linked to the source code
  2) Works with broken code
  3) Easier integration with IDEs

### Disadvantages
  1) Bigger language
  2) Source-code contains implicit facts

</div>
```java {all}
  void foo(java.lang.boolean);
    Code:
       0: aconst_null
       1: astore_2
       2: aload_1
       3: invokevirtual #2
       6: ifeq          12
       9: ldc           #3
      11: astore_2
      12: aload_2
      13: invokevirtual #4
      16: pop
      17: return
```
</div>

---

# Precision: numbers

<img border="rounded"  src="imgs/precision1.png">



---

# Precision: numbers

<img border="rounded"  src="imgs/precision2.png">

DeadAssignmentAnalysis: IntraJ detects everything that SonarQube detects
---

# Precision: numbers

<img border="rounded"  src="imgs/precision3.png">

DeadAssignmentAnalysis: IntraJ detects everything that SonarQube detects

NullPointerAnalysis: SonarQube is more precise but IntraJ remains competitive
---

# Performace

1. No dealy in the previous demo

<img border="rounded"  src="imgs/performance.png">
