<!DOCTYPE html>
<html>
<head>
	<title>Tutorial Membuat CRUD Pada Laravel - www.malasngoding.com</title>
</head>
<body>

	<h2><a href="https://www.malasngoding.com">www.malasngoding.com</a></h2>
	<h3>Edit AC</h3>

	<a href="/AC"> Kembali</a>

	<br/><br/>

	<form action="/AC/update/{{ $data->ID }}" method="post">
		{{ csrf_field() }}
		<input type="hidden" name="ID" value="{{ $data->ID }}"> <br/>
		Merk <input type="text" required="required" name="merk" value="{{ $data->merkAC }}"> <br/>
		Harga <input type="number" required="required" name="harga" value="{{ $data->hargaAC }}"> <br/>
		Tersedia <input type="checkbox" name="tersedia" {{ $data->tersedia ? 'checked' : '' }}> <br/>
		Berat <input type="number" step="any" required="required" name="berat" value="{{ $data->berat }}"> <br/>
		<input type="submit" value="Simpan Data">
	</form>

</body>
</html>
