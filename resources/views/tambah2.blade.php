@extends('template')
@section('content')
    <h3>Data AC</h3>

    <a href="/AC" class="btn" style="background-color: rgb(246, 226, 231); color:white; border-radius: 10px"> Kembali</a>

    <br />
    <br />

    <form action="/AC/store" method="post" class="form-horizontal">
        {{ csrf_field() }}
        <div class="form-group has-success">
            <label class="control-label col-sm-2" for="merk">
                Merk
            </label>
            <div class="col-sm-6">
                <input class="form-control" type="text" id="merk" placeholder="Masukkan Merk AC" name="merk"
                    required="required">
            </div>
        </div>

        <div class="form-group has-success">
            <label class="control-label col-sm-2" for="harga">
                Harga
            </label>
            <div class="col-sm-6">
                <input class="form-control" type="number" id="harga" placeholder="Masukkan Harga AC" name="harga"
                    required="required">
            </div>
        </div>

        <div class="form-group has-success">
            <label class="control-label col-sm-2" for="tersedia">
                Tersedia
            </label>
            <div class="col-sm-6">
                <input class="form-check" type="checkbox" id="tersedia" placeholder="Apakah AC Tersedia?" name="tersedia"
                    >
            </div>
        </div>

        <div class="form-group has-success">
            <label class="control-label col-sm-2" for="berat">
                Berat
            </label>
            <div class="col-sm-6">
                <input class="form-control" type="number" step="any" id="berat" placeholder="Masukkan Berat AC" name="berat"
                    required="required"></input>
            </div>
        </div>

        <input type="submit" value="Simpan Data" class="btn" style="background-color: rgb(246, 226, 231); color: rgb(255, 255, 255); border-color: rgb(246, 226, 231); border-radius: 10px">
    </form>
@endsection
