let count=0;
document.getElementById("item").innerHTML =
    Array.of(
        new Good(1, "image/2.jpg", "小米9全网通6GB内存+128GB 亮黑色", 2999, 1),
        new Good(1, "image/2.jpg", "锃光瓦亮", 999, 1),
new Good(1, "image/gwc_xiaomi6.jpg", "我是小老鼠（包邮）", 9.9, 1)
    ).map(i =>
               `
					<div class="neirong">
					<div class="input1">
					<input type="checkbox" name="shopping"  class="single">	
					</div>
						<div class="neirong1">
							<div class="pic2">
								<img src="img/2.jpg"class="pic2"/>

							</div>
							
								<a href="#">${i.name}
							    </a>

							
							
						</div>
						<div class="neirong2">
							<div class="pic4">
								透明版
							</div>
							<div class="pic4">
								8GB+128GB
							</div>
						
						</div>
					    <div class="neirong3">
					    	
					    		<span class="span3">${i.price}</span>
					    	
					    </div>
					    <div class="neirong4">
					    	<div class="pic6">
					    		<button class="add" value="+"  >+</button>
					    		<input class="input2" type="text" value="1">
					    		<button class="low" value="-"  >-</button>
					    	</div>
					    </div>
					    <div class="neirong5">
					    	
					    		<span class="span3">${i.price}</span>
					    	
					    	
					    </div>
					    <div class="neirong6">
					    	<button class="button1" value="delete">删除</button>
					    </div>
					</div>
        `
    ).join("");
Array.from(document.getElementsByClassName("add")).forEach(v=>{
	v.onclick=function(){
		
		let num=parseInt(this.nextElementSibling.value);
		++num;
		this.nextElementSibling.value=num;
		let price = Number.parseInt(this.parentElement.parentElement.previousElementSibling.children.item(0).innerHTML);
       let sum = Number.parseInt(this.parentElement.parentElement.nextElementSibling.children.item(0).innerHTML);
       this.parentElement.parentElement.nextElementSibling.children.item(0).innerHTML = sum + price;
       let flag=this.parentElement.parentElement.parentElement.firstElementChild.children.item(0).checked;
       if(flag==true){
       let all=Number.parseInt(document.getElementsByClassName("span4")[0].innerHTML);
       document.getElementsByClassName("span4")[0].innerHTML= all + price;}
	}
});


Array.from(document.getElementsByClassName("low")).forEach(v=>{
	v.onclick=function(){
		
		let num=parseInt(this.previousElementSibling.value);
		if(num<=1){
			return;
		}
		--num;
		this.previousElementSibling.value=num;
		let price = Number.parseInt(this.parentElement.parentElement.previousElementSibling.children.item(0).innerHTML);
       let sum = Number.parseInt(this.parentElement.parentElement.nextElementSibling.children.item(0).innerHTML);
       this.parentElement.parentElement.nextElementSibling.children.item(0).innerHTML = sum - price;
       let a=this.parentElement.parentElement.parentElement.firstElementChild.children.item(0).checked;
       if(a==true){
       let all=Number.parseInt(document.getElementsByClassName("span4")[0].innerHTML);
       document.getElementsByClassName("span4")[0].innerHTML= all - price;}
	}
});
Array.from(document.getElementsByClassName("button1")).forEach(v=>{
	v.onclick=function(){
		this.parentElement.parentElement.parentElement.removeChild(this.parentElement.parentElement);
		 let sum = Number.parseInt(this.parentElement.previousElementSibling.children.item(0).innerHTML);
		let all=Number.parseInt(document.getElementsByClassName("span4")[0].innerHTML);
		let flag=this.parentElement.parentElement.firstElementChild.children.item(0).checked;
		if(flag==true){
			document.getElementsByClassName("span4")[0].innerHTML= all - sum;
	}
	}
});

function Good(id, img, name, price, num) {
    this.id = id;
    this.img = img;
    this.name = name;
    this.price = price;
    this.num = num;
    this.sum = this.price * this.num;
};
document.getElementsByName("shopping")[0].onclick=function(){
	let a=document.getElementsByName("shopping")[0].checked;
	Array.from(document.getElementsByName("shopping")).forEach(i=>{i.checked=a;});
	if(a==true){
		count=document.getElementsByClassName("single").length;
		let all=0;
		Array.from(document.getElementsByClassName("add")).forEach(i=>{all=all+Number.parseInt(i.parentElement.parentElement.nextElementSibling.children.item(0).innerHTML);});
		document.getElementsByClassName("span4")[0].innerHTML= all ;}
	else{
		count=0;
		document.getElementsByClassName("span4")[0].innerHTML= 0;}
}
 
Array.from(document.getElementsByClassName("single")).forEach(i=>{
	i.onclick=function(){
		let sum = Number.parseInt(this.parentElement.parentElement.children.item(5).children.item(0).innerHTML);
		 let all=Number.parseInt(document.getElementsByClassName("span4")[0].innerHTML);
		 
		 
		if(i.checked==true){
			++count;
       document.getElementsByClassName("span4")[0].innerHTML= all + sum;
      
		}else{
			
			--count;
			document.getElementsByClassName("span4")[0].innerHTML= all - sum;
		}
		 if(count==document.getElementsByClassName("single").length){
		 	document.getElementsByName("shopping")[0].checked=true;}
		else{
			document.getElementsByName("shopping")[0].checked=false;}
	}
})
