/**
 *
**/ 
function main(){
function evalX() {
	return x < 10;
}
function evalY() {
	return y > 1;
}
var XVal = evalX();
print(XVal);
var YVal = evalY();
print(YVal);
var retVal ={"X" : XVal, "Y" : YVal};
return retVal;
}
main();
