<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class ACController extends Controller
{
    private function catatLog($namaRoute) {
        DB::table('logactivity')->insert([
            'namaroute' => $namaRoute
        ]);
    }

    public function index2()
    {
        $this->catatLog(request()->path());
        $AC = DB::table('AC')->get(); // pakai huruf kecil konsisten
        return view('index2', compact('AC'));
    }

    public function tambah2()
    {
        $this->catatLog(request()->path());
        return view('tambah2');
    }

    public function store(Request $request)
    {
        $this->catatLog(request()->path());
        $isTersedia = $request->has('tersedia');

        DB::table('AC')->insert([
            'merkAC' => $request->merk,
            'hargaAC' => $request->harga,
            'tersedia' => $isTersedia,
            'berat' => $request->berat
        ]);

        return redirect('/AC');
    }

    public function edit2($id)
    {
        $this->catatLog(request()->path());
        $data = DB::table('AC')->where('id', $id)->first(); // PAKAI `first()` agar satu object
        return view('edit2', compact('data')); // kirim variabel dengan nama $data
    }

    public function update(Request $request, $id)
    {
        $this->catatLog(request()->path());
        $isTersedia = $request->has('tersedia');

        DB::table('AC')->where('id', $id)->update([
            'merkAC' => $request->merk,
            'hargaAC' => $request->harga,
            'tersedia' => $isTersedia,
            'berat' => $request->berat
        ]);

        return redirect('/AC');
    }

    public function hapus($id)
    {
        $this->catatLog(request()->path());
        DB::table('AC')->where('id', $id)->delete();
        return redirect('/AC');
    }

    public function cari(Request $request)
    {
        $this->catatLog(request()->path());

        $cari = $request->cari;
        $AC = DB::table('AC')
                ->where('merkAC','like','%'.$cari.'%')
                ->get();

        return view('index2', compact('AC'));
    }
}
