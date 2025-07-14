class Book {
  constructor(title, author, year) {
    if (title && typeof title === "string" && title.trim() !== "") {
      this.title = title;
    }

    if (author && typeof author === "string" && author.trim() !== "") {
      this.author = author;
    }

    if (
      year &&
      typeof year === "number" &&
      Number.isFinite(year) &&
      year > 1800 &&
      year <= new Date().getFullYear()
    ) {
      this.year = year;
    }
  }
}

export class Ebook extends Book {
  constructor(title, author, year, fileSize) {
    super(title, author, year);
    if (fileSize && typeof fileSize === "number" && fileSize > 0) {
      this.fileSize = fileSize;
    }
  }

  download() {
    return `Downloading ${this.title} by ${this.author} (${this.fileSize}MB)...`;
  }
}
