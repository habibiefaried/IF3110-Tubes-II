var xmlhttpShop;
var jumlah; 
var keterangan;
var id_barang;
var id_order;

if (window.XMLHttpRequest)
{// code for IE7+, Firefox, Chrome, Opera, Safari
	xmlhttpShop=new XMLHttpRequest();
}
else
{// code for IE6, IE5
	xmlhttpShop=new ActiveXObject("Microsoft.XMLHTTP");
}

xmlhttpShop.onreadystatechange=function()
{
	if (xmlhttpShop.readyState==4 && xmlhttpShop.status==200)
	{
		var parsedData = JSON.parse(xmlhttpShop.responseText);		
		if (parsedData['content']=="OKE") alert("Berhasil");
		else if (parsedData['content'] == "LOGIN") alert("Anda belum login");
		else if (parsedData['content'] == "KREDIT") alert("Anda belum input kartu kredit");
		else alert("Transaksi Gagal");
	}
};

function beliBarang()
{
	xmlhttpShop.open("GET","http://localhost:8080/ruserba/barang/beli?id_barang="+id_barang+"&id_order="+id_order+"&jumlah="+jumlah+"&keterangan="+keterangan,true);
	xmlhttpShop.send();
	jumlah = "";
	keterangan = "";
}

function pertanyaan(id_b)
{
	id_order = 5;
	id_barang = id_b;
	jumlah = prompt("Masukkan jml barang","");
	keterangan = prompt("Tambahkan keterangan order (jika ada)","");
	beliBarang();
}
