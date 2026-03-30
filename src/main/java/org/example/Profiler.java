package org.example;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Profiler {
    // TODO : Profiler 구현
    private ArrayList<Integer> arr;
    private SortServiceLib lib;

    public void setData(ArrayList<Integer> arr) {
        this.arr = (ArrayList<Integer>) arr.clone();
    }
    public void setLib(SortServiceLib lib) {
        this.lib = lib;
    }
    public void runLib() {
        lib.sort(arr);
    }
    public void showResult() {
        System.out.println("정렬결과:["
                + arr.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "))
                + "]\nswap횟수:"
                + lib.getChangeCnt() + "회");
    }
}
