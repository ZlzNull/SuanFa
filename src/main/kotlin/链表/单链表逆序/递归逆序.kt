package 链表.单链表逆序

import 链表.LNode

fun recursiveReverse(head: LNode?): LNode? {
    //如果链表为空或者链表中只有一个元素
    return if (head?.next == null) {
        head
    } else {
        //反转后面的结点
        val newHead = recursiveReverse(head.next)
        //把当前遍历的结点加到后面结点逆序后链表的尾部
        head.next?.next = head
        head.next = null
        newHead
    }
}

fun 递归逆序(head: LNode) {
    //获取链表第一个结点
    val fristNode = head.next
    //对链表进行逆序
    val newHead = recursiveReverse(fristNode)
    //头结点指向逆序后链表的第一个结点
    head.next = newHead
}