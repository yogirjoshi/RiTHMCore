local function main()
  retval={}
  if tonumber(thrunning) == 1 then
    thrunning_p = true
  else
    thrunning_p = false
  end  
  if tonumber(thcreate) == 1 then
    thcreate_p = true
  else
    thcreate_p = false
  end  
  retval["thrunning"] = tostring(X)
  retval["thcreate"]  = tostring(Y)
  return retval
end
return main()
--http req and response code for example in the paper