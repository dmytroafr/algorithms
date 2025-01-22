// Notes
const animal = 3;

switch (animal) {
	case 1:
		document.write('Cow');
		break;
	case 2:
		document.write('Chicken');
		break;
	case 3:
		document.write('Monkey');
		break;
	default:
		document.write('Animal?');
};
var array = [1,10,5,15,2,7,28,900,45,18,27];
for (a = 0; a < array.length-1; a++){
    for (b = a; b < array.length; b++){
        if (array[b]< array[a]){
            var temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
        
    }
}
document.write(array);