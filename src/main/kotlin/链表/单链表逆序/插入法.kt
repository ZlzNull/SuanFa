package 链表.单链表逆序

import 链表.LNode

fun 插入法逆序(head: LNode) {
    //判断链表是否为空
    if (head.next == null) {
        return
    }
    var cur: LNode?//当前结点
    var next: LNode?//后继结点
    cur = head.next?.next
    //设置链表第一个结点变为尾结点
    head.next?.next = null
    //把遍历到的结点插入到头结点后面
    while (cur != null) {
        next = cur.next
        cur.next = head.next
        head.next = cur
        cur = next
    }
}