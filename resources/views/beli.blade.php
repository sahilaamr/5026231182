@extends('template')
@section('content')
    <h3>Beli</h3>

    <a href="/keranjang_belanja" class="btn" style="background-color: rgb(244, 193, 206); color:white; border-radius: 10px"> Kembali</a>

    <br />
    <br />

    <form action="/keranjang_belanja/store" method="post" class="form-horizontal">
        {{ csrf_field() }}
        <div class="form-group has-success">
            <label class="control-label col-sm-2" for="kode_barang">
                Kode Barang
            </label>
            <div class="col-sm-6">
                <input class="form-control" type="number" id="kode_barang" placeholder="Masukkan Kode Barang" name="kode_barang"
                    required="required">
            </div>
        </div>

        <div class="form-group has-success">
            <label class="control-label col-sm-2" for="jumlah_pembelian">
                Jumlah Pembelian
            </label>
            <div class="col-sm-6">
                <input class="form-control" type="number" id="jumlah_pembelian" placeholder="Masukkan Jumlah Pembelian" name="jumlah_pembelian"
                    required="required">
            </div>
        </div>

        <div class="form-group has-success">
            <label class="control-label col-sm-2" for="harga_per_item">
                Harga per item
            </label>
            <div class="col-sm-6">
                <input class="form-control" type="number" id="harga_per_item" placeholder="Masukkan Harga per item" name="harga_per_item"
                    required="required">
            </div>
        </div>

        <input type="submit" value="Simpan" class="btn" style="background-color: rgb(244, 193, 206); color: rgb(255, 255, 255); border-color: rgb(244, 193, 206); border-radius: 10px">
    </form>
@endsection
