# Tutorial
# 1) Backend
## Jsoup 
jsoup is a Java library for working with real-world HTML ,so we used this library to scratch data 
from web sites that updates world covid stats every single minute.
in order to work with jsoup you should download this library from [Jsoup]https://jsoup.org/download 
and add to the project libraies.

## Parsing 

Mainly to Scratch data we have two classes KGZ(Kyrgyzstan covid stats) and World(World stats).They are almost same except urls that we are connecting 
and some html tags.<br>
![1](https://user-images.githubusercontent.com/57888663/120247590-bf879880-c27c-11eb-9e45-d3e4407a3095.PNG)

## KGZ

First of all you need to import all reqired libraries <br>

![2](https://user-images.githubusercontent.com/57888663/120247689-0aa1ab80-c27d-11eb-95b3-876b099bf782.PNG)

In the consturctor we are connecting to the url and extracting data from web page and assign global String array cov_d[] to parsed data <br>

![3](https://user-images.githubusercontent.com/57888663/120247751-3fadfe00-c27d-11eb-9752-844308b85c07.PNG)


And 3 methods of class that return parsed data(total cases , deaths and the number of recovered peoples )
![4](https://user-images.githubusercontent.com/57888663/120247814-784dd780-c27d-11eb-8f1d-19555d6f2e04.PNG)


## World

This class almost same with KGZ class exept url and some html tags.

![5](https://user-images.githubusercontent.com/57888663/120247878-b945ec00-c27d-11eb-9d1d-00e9b6dc9d35.PNG)
# 2) Frondend
First establish javafx library to classpath. Make appropriate modules and write the following code to state scene.<br>
![image6](https://user-images.githubusercontent.com/60456879/103113475-20cf8e00-4685-11eb-9f67-79b010369abf.png)<br>
Stage Resizable is false for convenience.

## Scene Builder
To make it look like as it is on the image above, we used Scene Builder. You can download scene Builder [here](https://gluonhq.com/products/scene-builder/). We added and adjusted anchorpane, several labels and buttons and downloaded our university logo:)
Hierarchy is as followes:<br>
![image7](https://user-images.githubusercontent.com/60456879/103113669-09dd6b80-4686-11eb-9553-e3897386eb6b.png)<br>
For each label and button there is an id. Buttons also have onAction functions. Ids and functions are named as they should be.
<br>![image](https://user-images.githubusercontent.com/60456879/103113778-66408b00-4686-11eb-994e-3ba0aa14dd76.png)<br>
When you click on one of the two buttons Kyrgyzstan and world, labels with id total, death and recovery will change accordingly. Quit button will close the stage.
<br>
When you added labels, buttons, images and made for them ids', actions, layouts, you can save your sample.fxml and look at the View->Show Sample Controller Skeleton on the top left.
<br> ![image_viewcontroller](https://user-images.githubusercontent.com/60456879/103114241-04812080-4688-11eb-83f9-6916d398f068.png)<br>

There will be code for your Controller class. You must also configure your controller:
<br>![image_conf](https://user-images.githubusercontent.com/60456879/103114150-c126b200-4687-11eb-9da0-eb1b7ea30fc0.png)<br>
On Controller class there will be the following code for implementation:
<br>
![image](https://user-images.githubusercontent.com/60456879/103114331-52962400-4688-11eb-8be6-0b1918819c56.png)<br>
![image](https://user-images.githubusercontent.com/60456879/103114349-62156d00-4688-11eb-9c95-33f8ac46b7c2.png)<br>
