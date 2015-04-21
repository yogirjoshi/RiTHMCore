/**
 *
**/ 
function main(){
function evalX() {
	print(x);
	return x < 10;
}
function evalY() {
	print(y);
	return y > 1;
}
var XVal = evalX();
print(XVal);
var YVal = evalY();
print(YVal);
var retVal ={"XVal" : XVal, "YVal" : YVal};
return retVal;
}
main();
