package com.kodilla.patterns2.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature, Bookb> books);
    int medianPublicationYear(Map<BookSignature, Bookb> books);
}