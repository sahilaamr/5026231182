<!DOCTYPE html>
<html>
<head>
	<title>Tutorial Membuat CRUD Pada Laravel - www.malasngoding.com</title>
</head>
<body>

	<h2><a href="https://www.malasngoding.com">www.malasngoding.com</a></h2>
	<h3>Edit AC</h3>

	<a href="/AC"> Kembali</a>

	<br/>
	<br/>

	@foreach($AC as $p)
	<form action="/AC/update" method="post">
		{{ csrf_field() }}
		<input type="hidden" name="id" value="{{ $p->ID }}"> <br/>
		Merk <input type="text" required="required" name="merk" value="{{ $p->merkAC }}"> <br/>
		Harga <input type="number" required="required" name="harga" value="{{ $p->hargaAC }}"> <br/>
		Tersedia <input type="checkbox" name="tersedia" value="{{ $p->tersedia }}"> <br/>
		Berat <input type="number" step="any" required="required" name="berat" value="{{ $p->berat }}"> <br/>
		<input type="submit" value="Simpan Data">
	</form>
	@endforeach


</body>
</html>
