package com.ucsd.week4;

class ListNode<E> {
    ListNode<E> next;
    ListNode<E> prev;
    E data;

    public ListNode(E data) {
        this.data = data;
    }
}
