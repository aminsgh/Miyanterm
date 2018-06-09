public class SaveHeap {
    private HeapNode[] finalHeap = new HeapNode[20];
    private int counter = 0;

    public SaveHeap() {


    }


    public HeapNode bigger(HeapNode heapNode1, HeapNode heapNode2) {
        if (heapNode1.getPreferencePlus(0) > heapNode2.getPreferencePlus(0)) {
            return heapNode2;
        } else if (heapNode2.getPreferencePlus(0) > heapNode1.getPreferencePlus(0)) {
            return heapNode1;
        } else if (heapNode1.getPreferencePlus(0) == heapNode2.getPreferencePlus(0)) {
            if (heapNode1.getPreferencePlus(1) > heapNode2.getPreferencePlus(1)) {
                return heapNode2;
            } else if (heapNode2.getPreferencePlus(1) > heapNode1.getPreferencePlus(1)) {
                return heapNode1;
            } else if (heapNode1.getPreferencePlus(1) == heapNode2.getPreferencePlus(1)) {
                if (heapNode1.getPreferencePlus(2) > heapNode2.getPreferencePlus(2)) {
                    return heapNode2;
                } else if (heapNode2.getPreferencePlus(2) > heapNode1.getPreferencePlus(2)) {
                    return heapNode1;
                } else if (heapNode1.getPreferencePlus(2) == heapNode2.getPreferencePlus(2)) {
                    if (heapNode1.getPreferencePlus(3) > heapNode2.getPreferencePlus(3)) {
                        return heapNode2;
                    } else if (heapNode2.getPreferencePlus(3) > heapNode1.getPreferencePlus(3)) {
                        return heapNode1;
                    } else if (heapNode1.getPreferencePlus(3) == heapNode2.getPreferencePlus(3)) {
                        if (heapNode1.getPreferencePlus(4) > heapNode2.getPreferencePlus(4)) {
                            return heapNode2;
                        } else if (heapNode2.getPreferencePlus(4) > heapNode1.getPreferencePlus(4)) {
                            return heapNode1;
                        }
                    }

                }

            }
        }

        return heapNode1;
    }

    public HeapNode finalBigger(HeapNode heapNode1, HeapNode heapNode2) {
        if (heapNode1.getPreference() > heapNode2.getPreference()) {
            return heapNode2;
        } else if (heapNode2.getPreference() > heapNode1.getPreference()) {
            return heapNode1;
        } else return bigger(heapNode1, heapNode2);
    }

    public void order(HeapNode heapNode) {
        this.finalHeap[this.counter] = heapNode;
        beSortadd(this.counter);
        counter++;
    }

    public void beSortadd(int x) {
        int number = x;
        if (x % 2 == 0) {
            if (this.finalHeap[number / 2] != finalBigger(this.finalHeap[number], this.finalHeap[number / 2])) {
                swape(x, x / 2);
                beSortadd(number / 2);

            }
        } else {
            if (this.finalHeap[number / 2] != finalBigger(this.finalHeap[number], this.finalHeap[(number - 1) / 2])) {
                swape(x, (number - 1) / 2);
                beSortadd((number - 1) / 2);
            }
        }

    }

    public void listOrder(String agencyName) {
        for (int i = 0; i < this.counter; i++) {
            if (this.finalHeap[i].getAgency() == agencyName) {
                System.out.print(this.finalHeap[i].getService());
            }

        }
    }

    public void swape(int i, int j) {
        HeapNode tmp;
        tmp = this.finalHeap[i];
        this.finalHeap[i] = this.finalHeap[j];
        this.finalHeap[j] = tmp;
    }

    public void deleteOrder(String service) {
        swape(searching(service), 0);
        besortDelete();
        counter--;

    }

    public int searching(String service) {
        int number = 0;
        HeapNode node = new HeapNode();
        for (int i = 0; i < counter; i++) {
            if (finalHeap[i].getService() == service)
                node = finalHeap[i];
            number = i;
        }
        return number;
    }

    public void besortDelete() {
        for (int i = 0; i < counter; i++) {
            finalHeap[i] = finalHeap[i + 1];
        }
        finalHeap[counter] = null;
        for (int j=0;j<counter-1;j++){
            if (finalHeap[j]!=finalBigger(finalHeap[j],finalBigger(finalHeap[2*j],finalHeap[(2*j)+1]))){
                if (finalHeap[j] !=finalBigger(finalHeap[2*j],finalHeap[(2*j)+1])){
                    swape(j,(2*j)+1);
                }else {
                    swape(j,2*j);
                }


            }
        }
    }

}


