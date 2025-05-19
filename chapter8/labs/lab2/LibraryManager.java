package chapter8.labs.lab2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Lab 2: 컬렉션 프레임워크 활용하기
 *
 * 도서 관리 시스템의 주요 기능을 구현한 클래스입니다.
 */
public class LibraryManager {
    // 도서 목록 (ArrayList 활용)
    private List<Book> books;
    
    // 사용자별 대여 현황 (HashMap 활용)
    private Map<String, List<Book>> userBorrowMap;
    
    // 도서 카테고리 (HashSet 활용)
    private Set<String> categories;
    
    /**
     * 생성자
     */
    public LibraryManager() {
        // TODO: 필드를 초기화하세요.
        this.books = new ArrayList<>();
        this.userBorrowMap = new HashMap<>();
        this.categories = new HashSet<>();

    }
    
    /**
     * 도서 추가 메소드
     */
    public void addBook(Book book) {
        // TODO: 도서를 추가하고, 카테고리도 Set에 추가하세요.
        books.add(book);
        categories.add(book.getCategory());

    }
    
    /**
     * 도서 검색 메소드 (제목으로 검색)
     */
    public List<Book> searchBooksByTitle(String title) {
        // TODO: 제목에 검색어가 포함된 도서를 검색하세요.
        List<Book> searchedBooks = new ArrayList<>();

        for (Book oneBook : books){
            if (oneBook.getTitle().contains(title));
                searchedBooks.add(oneBook);
        return searchedBooks;
        }
        return null;
            
        // 다른 방법
//        return books.stream()
//                .filter(oneBook -> oneBook.getTitle().contains(title))
//                .collect(Collectors.toList());
    }
    
    /**
     * 도서 검색 메소드 (저자로 검색)
     */
    public List<Book> searchBooksByAuthor(String author) {
        // TODO: 저자명으로 도서를 검색하세요.
        List<Book> searchedAuthors = new ArrayList<>();
        for (Book oneBook : books){
            if(oneBook.getAuthor().contains(author)){
                searchedAuthors.add(oneBook);
        return searchedAuthors;
            }

        }
        return null;
    }
    
    /**
     * 도서 대여 메소드
     */
    public boolean borrowBook(String userId, String isbn) {
        // TODO: 도서를 대여하고, 사용자별 대여 현황을 업데이트하세요.

        // 대여할 도서가 있는지 확인
        // 이 책이 대여 가능한지 확인 (대여목록에 있는지) -> 생략
        // user의 북리스트를 찾아서
            // 그 리스트안에 추가
            // 한번도 안빌린 경우 -> null 일경우 새로운 객체 생성

        for (Book oneBook : books){
            if(oneBook.equals(isbn)){
                if (userBorrowMap.get(userId) ==null)
                    userBorrowMap.put(userId,new ArrayList<>());
                userBorrowMap.get(userId).add(oneBook);
            }else{
                System.out.println("찾으시는 책이 없습니다.");
            }
        }
        return false;
    }
    
    /**
     * 도서 반납 메소드
     */
    public boolean returnBook(String userId, String isbn) {
        // TODO: 도서를 반납하고, 사용자별 대여 현황을 업데이트하세요.

        for (Book oneBook : books){
            if(oneBook.equals(isbn)){
                if (userBorrowMap.get(userId) ==null)
                    userBorrowMap.put(userId,new ArrayList<>());
                userBorrowMap.get(userId).remove(oneBook);
            }else{
                System.out.println("찾으시는 책이 없습니다.");
            }
        }
        return false;
    }

    
    /**
     * 사용자의 대여 도서 목록 조회 메소드
     */
    public List<Book> getBorrowedBooks(String userId) {
        // TODO: 사용자가 대여한 도서 목록을 반환하세요.
        List<Book> borrowlist = new ArrayList<>();

        List<Book> userbooks = userBorrowMap.get(userId);
        if(userbooks != null){
            for (Book oneBook : userbooks){
                borrowlist.add(oneBook);
                };
        }
        return borrowlist ;
    }
    
    /**
     * 도서 정렬 메소드 (제목 기준)
     */
    public List<Book> getSortedBooksByTitle() {
        // TODO: 제목 기준으로 정렬된 도서 목록을 반환하세요.

//        Collections.sort(books, Book.TitleComparator);
        List<Book> cloneBooks = new ArrayList<>(books);
        Collections.sort(cloneBooks, new Comparator<Book>() {
            @Override
            public int compare(Book oneBook, Book twoBook) {
            return oneBook.getTitle().compareTo(twoBook.getTitle());}
        });
    return cloneBooks;}

    
    /**
     * 도서 정렬 메소드 (출판년도 기준)
     */
    public List<Book> getSortedBooksByYear() {
        // TODO: 출판년도 기준으로 정렬된 도서 목록을 반환하세요.

        return books.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }
    
    /**
     * 도서 정렬 메소드 (가격 기준)
     */
    public List<Book> getSortedBooksByPrice() {
        // TODO: 가격 기준으로 정렬된 도서 목록을 반환하세요.


        return books.stream()
                .sorted(Comparator.comparing(Book::getPrice))
                .collect(Collectors.toList());
    }
    
    /**
     * 카테고리 목록 조회 메소드
     */
    public Set<String> getCategories() {
        // TODO: 모든 카테고리를 반환하세요.

        return categories;
    }
    
    /**
     * 카테고리별 도서 목록 조회 메소드
     */
    public List<Book> getBooksByCategory(String category) {
        // TODO: 특정 카테고리에 속한 도서 목록을 반환하세요.
        List<Book> booksByCategory = new ArrayList<>();

        for (Book oneBook : books){
            if(oneBook.getCategory() == category){
                booksByCategory.add(oneBook);
            }
        }
        return booksByCategory;
    }
    
    /**
     * 전체 도서 목록 조회 메소드
     */
    public List<Book> getAllBooks() {
        // TODO: 전체 도서 목록을 반환하세요.

        return books;
    }
} 