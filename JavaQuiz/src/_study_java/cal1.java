package _study_java;

class cal1 {

    // static double PI = 3.14;
    int left, right;
    static int base = 0;

    // 생성자
    public cal1(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void setOp(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2.0);
    }

    static class Substract {
        private int left, right;

        public void setOp(int left, int right) {
            this.left = left;
            this.right = right;
        }

        public void multi() {
            System.out.println(this.left - this.right);
        }
    }

    public static void main(String[] args) {
        cal1 calc = new cal1(12, 34);
        calc.sum();
        calc.avg();
        
        // Substract 클래스 사용
        Substract sub = new Substract();
        sub.setOp(12, 34);
        sub.multi();
    }
}
