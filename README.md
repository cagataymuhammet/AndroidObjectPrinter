
[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)]

# Android Object Printer

A Pretty Object Printer Module For Android

# Gson

Gson is a Java library that can be used to convert Java Objects into their JSON representation. It can also be used to convert a JSON string to an equivalent Java object.
Gson can work with arbitrary Java objects including pre-existing objects that you do not have source-code of.

There are a few open-source projects that can convert Java objects to JSON. However, most of them require that you place Java annotations in your classes; something that you can not do if you do not have access to the source-code. Most also do not fully support the use of Java Generics. Gson considers both of these as very important design goals.

For More Detail  https://github.com/google/gson


# Simple Usage
```java

 ObjectPrinter.printJson(object);
 
 ```


### Add dependency

More info https://jitpack.io/#cagataymuhammet/AndroidObjectPrinter

```gradle

maven { url 'https://jitpack.io' }

```

```gradle

dependencies {
	  api 'com.github.cagataymuhammet:AndroidObjectPrinter:a7f2607c8a'
}

```


```
License
--------

    Copyright 2018 Muhammet ÇAĞATAY.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
