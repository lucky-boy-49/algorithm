package main.huawei_machine_test;

import java.util.ArrayList;
import java.util.List;

/**
 * 叠放书籍
 */
public class StackBooks {

    public static void solution(String input) {

        List<Book> books = new ArrayList<>();
        String[] split = input.substring(2, input.length() - 2)
                .split("],\\[");
        for (String book : split) {
            String[] lw = book.split(",");
            int l = Integer.parseInt(lw[0]);
            int w = Integer.parseInt(lw[1]);
            books.add(new Book(l, w));
        }

        books.sort(Book::compareTo);

        int res = counter(books);
        System.out.println(res);

    }

    private static int counter(List<Book> books) {
        int count = 0;
        Book last = null;
        for (Book cur : books) {
            if (last == null) {
                count = 1;
                last = cur;
            } else if (last.l > cur.l && last.w > cur.w) {
                count++;
                last = cur;
            }
        }
        return count;
    }

    private static class Book implements Comparable<Book> {

        int l;

        int w;

        public Book(int l, int w) {
            this.l = l;
            this.w = w;
        }

        @Override
        public int compareTo(Book b) {
            if (this.l > b.l && this.w > b.w) {
                return -1;
            } else {
                return b.l - this.l;
            }
        }
    }

}
