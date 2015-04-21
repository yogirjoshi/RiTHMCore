/**
 *
**/ 
//thrunning=0,thdestroy=0,timestamp=0x9cd2a096,threply=0,thcreate=1,ID=0,thready=0

function main(){
function evalthrunning() {
	return thrunningProg == 1;
}
function evalthdestroy() {
	return thdestroyProg == 1;
}
function evalthreply() {
	return threplyProg == 1;
}
function evalthcreate() {
	return thcreateProg == 1;
}
function evalthready() {
	return threadyProg == 1;
}
var thrunning = evalthrunning();
var thdestroy = evalthdestroy();
var threply = evalthreply();
var thcreate = evalthcreate();
var thready = evalthready();

var retVal ={"thrunning" : thrunning, 
			  "thdestroy" : thdestroy,
			  "threply" : threply,
			  "thcreate" : thcreate,
			  "thready" : thready
			  };
if(thrunning == 0)
	delete retVal["thrunning"];
if(thdestroy == 0)
	delete retVal["thdestroy"];
if(threply == 0)
	delete retVal["threply"];
if(thcreate == 0)
	delete retVal["thcreate"];
if(thready == 0)
	delete retVal["thready"];
return retVal;
}
main();
