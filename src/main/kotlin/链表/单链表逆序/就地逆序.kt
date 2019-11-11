package 链表.单链表逆序

import 链表.LNode

fun reverse(head: LNode) {
    //判断链表是否为空
    if (head.next == null) {
        return
    }

    var pre: LNode?//前驱结点
    var cur: LNode?//当前结点
    var next: LNode?//后继结点
    //把链表首结点变为尾结点
    cur = head.next
    next = cur?.next
    cur?.next = null
    pre = cur
    cur = next
    //使当前遍历到的结点cur指向其前驱结点
    while (cur?.next != null) {
        next = cur.next
        cur.next = pre
        pre = cur
        cur = next
    }
    //链表最后一个结点指向倒数第二个结点
    cur?.next = pre
    //链表的头结点指向原来链表的尾结点
    head.next = cur
}