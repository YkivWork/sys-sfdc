def list = payload;
StringBuffer buff = new StringBuffer();
buff.append(list );
def ids = buff.toString().replace(", ","','").replace("[","('").replace("]","')")
return ids