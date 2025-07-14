import { Ebook } from "./book";
import { describe, it, expect, beforeEach } from "vitest";

describe("Ebook", () => {
  let ebook;

  beforeEach(() => {
    ebook = new Ebook("Title", "Author", 2021, 10);
  });

  it("should have the correct title", () => {
    expect(ebook.title).toBe("Title");
  });

  it("should have the correct author", () => {
    expect(ebook.author).toBe("Author");
  });

  it("should have the correct year", () => {
    expect(ebook.year).toBe(2021);
  });

  it("should have the correct file size", () => {
    expect(ebook.fileSize).toBe(10);
  });

  it("should return the correct download message", () => {
    expect(ebook.download()).toContain("Title");
    expect(ebook.download()).toContain("10");
  });
});
