<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class SoalA1Controller extends Controller
{
    public function index4()
    {
        $counter = DB::table('pagecounter')->where('ID', 1)->first();
        $jumlahpengunjung = 0;
        if($counter){
            $newjumlah =$counter-> jumlah+1;
            DB::table('pagecounter')
            ->where('ID',1)
            ->update(['jumlah'=>$newjumlah]);
        }
        $jumlahpengunjung = $newjumlah;
        return view('index4', ['jumlahpengunjung' => $jumlahpengunjung]);
    }

}
