<strong> List Barang </strong><br>
<strong> Sort berdasarkan</strong><br>
Nama (<a href="#" onclick="init('/ruserba/barang','nama','ASC','<%=request.getAttribute("NamaBarang")%>','<%=request.getAttribute("kategori")%>','<%=request.getAttribute("harga")%>','<%=request.getAttribute("OP")%>')">ASC</a>,<a href="#" onclick="init('/ruserba/barang','nama','DESC','<%=request.getAttribute("NamaBarang")%>','<%=request.getAttribute("kategori")%>','<%=request.getAttribute("harga")%>','<%=request.getAttribute("OP")%>')">DESC</a>) <br>
Harga (<a href="#" onclick="init('/ruserba/barang','harga','ASC','<%=request.getAttribute("NamaBarang")%>','<%=request.getAttribute("kategori")%>','<%=request.getAttribute("harga")%>','<%=request.getAttribute("OP")%>')">ASC</a>,<a href="#" onclick="init('/ruserba/barang','harga','DESC','<%=request.getAttribute("NamaBarang")%>','<%=request.getAttribute("kategori")%>','<%=request.getAttribute("harga")%>','<%=request.getAttribute("OP")%>')">DESC</a>) <br>
Kategori (<a href="#" onclick="init('/ruserba/barang','kategori','ASC','<%=request.getAttribute("NamaBarang")%>','<%=request.getAttribute("kategori")%>','<%=request.getAttribute("harga")%>','<%=request.getAttribute("OP")%>')">ASC</a>,<a href="#" onclick="init('/ruserba/barang','kategori','DESC','<%=request.getAttribute("NamaBarang")%>','<%=request.getAttribute("kategori")%>','<%=request.getAttribute("harga")%>','<%=request.getAttribute("OP")%>')">DESC</a>) <br> 

<table id="ISI">
</table>
<center><img src="/ruserba/images/loader.gif"></center>