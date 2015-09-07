local function main()
  retval={}
  if tonumber(x) < 10 then
    X = true
  else
    X = false
  end  
  if tonumber(y) > 5 then
     Y = true
  else
     Y = false
  end
  retval["X"] = tostring(X)
  retval["Y"] = tostring(Y)
  return retval
end
return main()


