package 链表.单链表逆序

import 链表.LNode


fun main() {
    val head = LNode()
    var temp: LNode?
    var cur: LNode? = head
    //构造单链表
    for (i in 1..7) {
        temp = LNode(i)
        cur?.next = temp
        cur = temp
    }
    print("逆序前:")
    printLNode(head)
    print("逆序后:")
    reverse(head)
    printLNode(head)
    print("再次逆序后:")
    递归逆序(head)
    printLNode(head)
    print("再次逆序后:")
    插入法逆序(head)
    printLNode(head)
}

fun printLNode(head: LNode) {
    var cur = head.next
    while (cur != null) {
        print("${cur.data} ")
        cur = cur.next
    }
    println()
}