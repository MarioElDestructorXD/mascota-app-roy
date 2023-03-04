const isAdopcion = (value)=>{
	console.log(value)
	let origin = window.location.origin;
	let animal = window.location.pathname.split("/")[3]

	let route = "";
	if(value){
		route = `${origin}/mascotas/listar/${animal}/${value}`;
		window.location.replace(route);
	}else{
		route = `${origin}/mascotas/listar/${animal}/false`;
		window.location.replace(route);
	}
}


const onLoad = ()=>{
	let isAdopcion = window.location.pathname.split("/")[4]
	if(isAdopcion === "true") {
		let check = document.getElementById("adopcion");
		check.checked = true;
	}
}