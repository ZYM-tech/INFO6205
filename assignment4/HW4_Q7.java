public class HW4_Q7 {
    class PolyNode {
       int coefficient, power;
       PolyNode next = null;
       PolyNode() {}
       PolyNode(int x, int y) { this.coefficient = x; this.power = y; }
       PolyNode(int x, int y, PolyNode next) { this.coefficient = x; this.power = y; this.next = next; }
   }
   //Time: O(n)  Space: O(1)
    public PolyNode addPoly(PolyNode poly1, PolyNode poly2) {
        PolyNode dummy = new PolyNode();
        PolyNode cur = dummy;
        while (poly1 != null && poly2 != null) {
            if (poly1.power == poly2.power) {
                int s = poly1.coefficient + poly2.coefficient;
                if (s == 0) {
                    poly1 = poly1.next;
                    poly2 = poly2.next;
                    continue;
                }
                cur.next = new PolyNode(s, poly1.power);
                cur = cur.next;
                poly1 = poly1.next;
                poly2 = poly2.next;
            } else if (poly1.power > poly2.power) {
                cur.next = new PolyNode(poly1.coefficient, poly1.power);
                cur = cur.next;
                poly1 = poly1.next;
            } else {
                cur.next = new PolyNode(poly2.coefficient, poly2.power);
                cur = cur.next;
                poly2 = poly2.next;
            }
        }
        while (poly1 != null) {
            cur.next = new PolyNode(poly1.coefficient, poly1.power);
            cur = cur.next;
            poly1 = poly1.next;
        }
        while (poly2 != null) {
            cur.next = new PolyNode(poly2.coefficient, poly2.power);
            cur = cur.next;
            poly2 = poly2.next;
        }
        return dummy.next;
    }
}
