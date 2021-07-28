import {Injectable} from '@angular/core';
import {Dictionary} from '../model/dictionary';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  dictionarys: Dictionary[] = [
    {
      id: 1,
      word: 'Hi',
      translate: 'Xin Chào'
    },
    {
      id: 2,
      word: 'Good Morning',
      translate: 'Chào Buổi Sáng'
    },
    {
      id: 3,
      word: 'Good Afternoon',
      translate: 'Chào Buổi Trưa'
    },
    {
      id: 4,
      word: 'Good Night',
      translate: 'Chúc ngủ ngon'
    },
    {
      id: 5,
      word: 'Thank you',
      translate: 'Cám ơn'
    },
  ];

  constructor() {
  }

  getAll() {
    return this.dictionarys;
  }

  findById(id: number) {
    for (const dictionary of this.dictionarys) {
      if (dictionary.id === id) {
        return dictionary;
      }
    }
  }
}
